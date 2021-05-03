import { Meta } from '@storybook/react';
import React from 'react';
import { Logo } from '../Logo';

export default {
  title: 'Medplum/Logo',
  component: Logo,
} as Meta;

export const Basic = () => (
  <Logo width={200} height={200} />
);