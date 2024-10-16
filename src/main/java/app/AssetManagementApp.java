package app;

import dao.AssetManagementService;
import dao.AssetManagementServiceImpl;
import entity.Asset;
import exception.AssetNotFoundException;
import exception.AssetNotMaintainException;

import java.util.Scanner;

public class AssetManagementApp {

    public static void main(String[] args) {
        AssetManagementService assetService = new AssetManagementServiceImpl();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\n--- Asset Management System ---");
            System.out.println("1. Add Asset");
            System.out.println("2. Update Asset");
            System.out.println("3. Delete Asset");
            System.out.println("4. Allocate Asset");
            System.out.println("5. Deallocate Asset");
            System.out.println("6. Perform Maintenance");
            System.out.println("7. Reserve Asset");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter asset name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter asset type: ");
                        String type = scanner.nextLine();
                        System.out.print("Enter serial number: ");
                        String serialNumber = scanner.nextLine();
                        System.out.print("Enter purchase date (YYYY-MM-DD): ");
                        String purchaseDate = scanner.nextLine();
                        System.out.print("Enter location: ");
                        String location = scanner.nextLine();
                        System.out.print("Enter status: ");
                        String status = scanner.nextLine();
                        System.out.print("Enter owner ID: ");
                        int ownerId = scanner.nextInt();
                        
                        Asset newAsset = new Asset(name, type, serialNumber, purchaseDate, location, status, ownerId);
                        if (assetService.addAsset(newAsset)) {
                            System.out.println("Asset added successfully.");
                        } else {
                            System.out.println("Failed to add asset.");
                        }
                        break;
                        
                    case 2:
                        System.out.print("Enter asset ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        
                        System.out.print("Enter updated asset name: ");
                        String updateName = scanner.nextLine();
                        System.out.print("Enter updated asset type: ");
                        String updateType = scanner.nextLine();
                        System.out.print("Enter updated serial number: ");
                        String updateSerial = scanner.nextLine();
                        System.out.print("Enter updated purchase date (YYYY-MM-DD): ");
                        String updateDate = scanner.nextLine();
                        System.out.print("Enter updated location: ");
                        String updateLocation = scanner.nextLine();
                        System.out.print("Enter updated status: ");
                        String updateStatus = scanner.nextLine();
                        System.out.print("Enter updated owner ID: ");
                        int updateOwner = scanner.nextInt();
                        
                        Asset updatedAsset = new Asset(updateId, updateName, updateType, updateSerial, updateDate, updateLocation, updateStatus, updateOwner);
                        if (assetService.updateAsset(updatedAsset)) {
                            System.out.println("Asset updated successfully.");
                        } else {
                            System.out.println("Failed to update asset.");
                        }
                        break;
                        
                    case 3:
                        System.out.print("Enter asset ID to delete: ");
                        int deleteId = scanner.nextInt();
                        
                        if (assetService.deleteAsset(deleteId)) {
                            System.out.println("Asset deleted successfully.");
                        } else {
                            System.out.println("Failed to delete asset.");
                        }
                        break;
                        
                    case 4:
                        System.out.print("Enter asset ID to allocate: ");
                        int allocAssetId = scanner.nextInt();
                        System.out.print("Enter employee ID: ");
                        int allocEmployeeId = scanner.nextInt();
                        System.out.print("Enter allocation date (YYYY-MM-DD): ");
                        String allocDate = scanner.next();
                        
                        if (assetService.allocateAsset(allocAssetId, allocEmployeeId, allocDate)) {
                            System.out.println("Asset allocated successfully.");
                        } else {
                            System.out.println("Failed to allocate asset.");
                        }
                        break;
                        
                    case 5:
                        System.out.print("Enter asset ID to deallocate: ");
                        int deallocAssetId = scanner.nextInt();
                        System.out.print("Enter employee ID: ");
                        int deallocEmployeeId = scanner.nextInt();
                        System.out.print("Enter return date (YYYY-MM-DD): ");
                        String returnDate = scanner.next();
                        
                        if (assetService.deallocateAsset(deallocAssetId, deallocEmployeeId, returnDate)) {
                            System.out.println("Asset deallocated successfully.");
                        } else {
                            System.out.println("Failed to deallocate asset.");
                        }
                        break;
                        
                    case 6:
                        System.out.print("Enter asset ID for maintenance: ");
                        int maintAssetId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter maintenance date (YYYY-MM-DD): ");
                        String maintDate = scanner.nextLine();
                        System.out.print("Enter maintenance description: ");
                        String description = scanner.nextLine();
                        System.out.print("Enter maintenance cost: ");
                        double cost = scanner.nextDouble();
                        
                        if (assetService.performMaintenance(maintAssetId, maintDate, description, cost)) {
                            System.out.println("Maintenance performed successfully.");
                        } else {
                            System.out.println("Failed to perform maintenance.");
                        }
                        break;
                        
                    case 7:
                        System.out.print("Enter asset ID to reserve: ");
                        int reserveAssetId = scanner.nextInt();
                        System.out.print("Enter employee ID: ");
                        int reserveEmployeeId = scanner.nextInt();
                        System.out.print("Enter reservation date (YYYY-MM-DD): ");
                        String reserveDate = scanner.next();
                        System.out.print("Enter start date (YYYY-MM-DD): ");
                        String startDate = scanner.next();
                        System.out.print("Enter end date (YYYY-MM-DD): ");
                        String endDate = scanner.next();
                        
                        if (assetService.reserveAsset(reserveAssetId, reserveEmployeeId, reserveDate, startDate, endDate)) {
                            System.out.println("Asset reserved successfully.");
                        } else {
                            System.out.println("Failed to reserve asset.");
                        }
                        break;
                        
                    case 8:
                        exit = true;
                        break;
                        
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } catch (AssetNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (AssetNotMaintainException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
        
        System.out.println("Exiting the application.");
        scanner.close();
    }
}
