package com.gigaspaces.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 05.09.2018
 */
@Embeddable
public class ReferanceCodesTCompositeId implements Serializable {

    @Column(name = "TABLE_NAME")
    private String tableName;
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Column(name = "COLUMN_VALUE")
    private String columnValue;

    public ReferanceCodesTCompositeId() {
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferanceCodesTCompositeId that = (ReferanceCodesTCompositeId) o;
        return Objects.equals(tableName, that.tableName) &&
                Objects.equals(columnName, that.columnName) &&
                Objects.equals(columnValue, that.columnValue);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tableName, columnName, columnValue);
    }

    @Override
    public String toString() {
        return "ReferanceCodesTCompositeId{" +
                "tableName='" + tableName + '\'' +
                ", columnName='" + columnName + '\'' +
                ", columnValue='" + columnValue + '\'' +
                '}';
    }
}
