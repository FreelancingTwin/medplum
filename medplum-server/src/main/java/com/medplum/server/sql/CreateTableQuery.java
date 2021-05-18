package com.medplum.server.sql;

import java.util.ArrayList;
import java.util.List;

public class CreateTableQuery {
    private final String tableName;
    private final List<ColumnDefinition> columns;
    private final List<String> indexes;

    private CreateTableQuery(final Builder builder) {
        this.tableName = builder.tableName;
        this.columns = builder.columns;
        this.indexes = builder.indexes;
    }

    public String getTableName() {
        return tableName;
    }

    public List<ColumnDefinition> getColumns() {
        return columns;
    }

    public List<String> getIndexes() {
        return indexes;
    }

    public static class ColumnDefinition {
        private final String columnName;
        private final String columnType;

        public ColumnDefinition(final String columnName, final String columnType) {
            this.columnName = columnName;
            this.columnType = columnType;
        }

        public String getColumnName() {
            return columnName;
        }

        public String getColumnType() {
            return columnType;
        }
    }

    public static class Builder {
        private final String tableName;
        private final List<ColumnDefinition> columns;
        private final List<String> indexes;

        public Builder(final String tableName) {
            this.tableName = tableName;
            this.columns = new ArrayList<>();
            this.indexes = new ArrayList<>();
        }

        public Builder column(final String columnName, final String columnType) {
            this.columns.add(new ColumnDefinition(columnName, columnType));
            return this;
        }

        public Builder index(final String columnName) {
            this.indexes.add(columnName);
            return this;
        }

        public CreateTableQuery build() {
            return new CreateTableQuery(this);
        }
    }
}