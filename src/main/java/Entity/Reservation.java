package entity;

import java.util.Date;

public class Reservation {
    private int reservationId;
    private int assetId;
    private int employeeId;
    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private String status;

    // Default Constructor
    public Reservation() {}

    // Parameterized Constructor
    public Reservation(int reservationId, int assetId, int employeeId, Date reservationDate, Date startDate, Date endDate, String status) {
        this.reservationId = reservationId;
        this.assetId = assetId;
        this.employeeId = employeeId;
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    // Getters and Setters
    public int getReservationId() { return reservationId; }
    public void setReservationId(int reservationId) { this.reservationId = reservationId; }

    public int getAssetId() { return assetId; }
    public void setAssetId(int assetId) { this.assetId = assetId; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public Date getReservationDate() { return reservationDate; }
    public void setReservationDate(Date reservationDate) { this.reservationDate = reservationDate; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
