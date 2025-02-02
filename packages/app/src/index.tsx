import { MantineProvider, MantineThemeOverride } from '@mantine/core';
import { NotificationsProvider } from '@mantine/notifications';
import { MedplumClient } from '@medplum/core';
import { MedplumProvider } from '@medplum/react';
import React from 'react';
import { createRoot } from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import { App } from './App';

if (process.env.NODE_ENV === 'production' && 'serviceWorker' in navigator) {
  window.addEventListener('load', () => {
    navigator.serviceWorker
      .register('/service-worker.js')
      .then((reg) => {
        console.log('SW registered: ', reg);
        return reg.update();
      })
      .then((reg) => {
        console.log('SW updated: ', reg);
      })
      .catch((regError) => console.log('SW registration failed: ', regError));
  });
}

const medplum = new MedplumClient({
  baseUrl: process.env.MEDPLUM_BASE_URL as string,
  clientId: process.env.MEDPLUM_CLIENT_ID as string,
  cacheTime: 60000,
  autoBatchTime: 100,
  onUnauthenticated: () => {
    if (window.location.pathname !== '/signin' && window.location.pathname !== '/oauth') {
      window.location.href = '/signin?next=' + encodeURIComponent(window.location.pathname + window.location.search);
    }
  },
});

const theme: MantineThemeOverride = {
  headings: {
    sizes: {
      h1: {
        fontSize: 18,
        fontWeight: 500,
        lineHeight: 2.0,
      },
    },
  },
  fontSizes: {
    xs: 11,
    sm: 14,
    md: 14,
    lg: 16,
    xl: 18,
  },
};

const router = createBrowserRouter([{ path: '*', element: <App /> }]);

const navigate = (path: string): Promise<void> => router.navigate(path);

const root = createRoot(document.getElementById('root') as HTMLElement);
root.render(
  <React.StrictMode>
    <MedplumProvider medplum={medplum} navigate={navigate}>
      <MantineProvider theme={theme} withGlobalStyles withNormalizeCSS>
        <NotificationsProvider position="bottom-right">
          <RouterProvider router={router} />
        </NotificationsProvider>
      </MantineProvider>
    </MedplumProvider>
  </React.StrictMode>
);
