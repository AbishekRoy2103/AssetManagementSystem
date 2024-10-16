package entity;

import java.util.Date;

public class MaintenanceRecord {
    private int maintenanceId;
    private int assetId;
    private Date maintenanceDate;
    private String description;
    private double cost;

    // Default Constructor
    public MaintenanceRecord() {}

    // Parameterized Constructor
    public MaintenanceRecord(int maintenanceId, int assetId, Date maintenanceDate, String description, double cost) {
        this.maintenanceId = maintenanceId;
        this.assetId = assetId;
        this.maintenanceDate = maintenanceDate;
        this.description = description;
        this.cost = cost;
    }

    // Getters and Setters
    public int getMaintenanceId() { return maintenanceId; }
    public void setMaintenanceId(int maintenanceId) { this.maintenanceId = maintenanceId; }

    public int getAssetId() { return assetId; }
    public void setAssetId(int assetId) { this.assetId = assetId; }

    public Date getMaintenanceDate() { return maintenanceDate; }
    public void setMaintenanceDate(Date maintenanceDate) { this.maintenanceDate = maintenanceDate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }
}
