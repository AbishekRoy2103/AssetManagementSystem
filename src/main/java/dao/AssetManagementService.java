package dao;

import entity.Asset;

public interface AssetManagementService {
    
    // Add Asset
    boolean addAsset(Asset asset);
    
    // Update Asset
    boolean updateAsset(Asset asset);
    
    // Delete Asset by ID
    boolean deleteAsset(int assetId);
    
    // Allocate Asset to an Employee
    boolean allocateAsset(int assetId, int employeeId, String allocationDate);
    
    // Deallocate Asset from an Employee
    boolean deallocateAsset(int assetId, int employeeId, String returnDate);
    
    // Perform Maintenance on Asset
    boolean performMaintenance(int assetId, String maintenanceDate, String description, double cost);
    
    // Reserve Asset for a Specific Period
    boolean reserveAsset(int assetId, int employeeId, String reservationDate, String startDate, String endDate);
    
    // Withdraw a Reservation
    boolean withdrawReservation(int reservationId);
}
