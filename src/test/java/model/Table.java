package model;

import java.math.BigDecimal;

public class Table {
    private Float tableWidth;
    private Float tableHeight;
    private String typeOfMaterial;
    private String tableColor;
    private BigDecimal tablePrice;

    public Float getTableWidth() {
        return tableWidth;
    }

    public void setTableWidth(Float tableWidth) {
        this.tableWidth = tableWidth;
    }

    public Float getTableHeight() {
        return tableHeight;
    }

    public void setTableHeight(Float tableHeight) {
        this.tableHeight = tableHeight;
    }

    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public String getTableColor() {
        return tableColor;
    }

    public void setTableColor(String tableColor) {
        this.tableColor = tableColor;
    }

    public BigDecimal getTablePrice() {
        return tablePrice;
    }

    public void setTablePrice(BigDecimal tablePrice) {
        this.tablePrice = tablePrice;
    }
}
