package models;

import java.time.LocalDate;

public class Villa extends Services implements RentalContract{
    private String roomStandard;
    private String amenitie;
    private String poolArea;
    private int numberOfFloors;

    public Villa(String roomStandard, String amenitie, String poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String id, String serviceName, String usableArea, double rentalCost, String maxNumberOfPeople,
                 String rentalType, String roomStandard, String amenitie, String poolArea, int numberOfFloors) {
        super(id, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getAmenitie() {
        return amenitie;
    }

    public void setAmenitie(String amenitie) {
        this.amenitie = amenitie;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    @Override
    public String showInfor() {
        return "Villa{" +
                " id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", roomStandard=" + roomStandard +
                ", amenitie='" + amenitie + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +" Tri???u"+
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public void rentalContract(int numberContract, LocalDate startDay, LocalDate endDay, double deposit, double totalPay) {
        System.out.println("H???p ?????ng thu?? :");
        System.out.println("S??? h???p ?????ng: "+ numberContract);
        System.out.println("Ng??y b???t ?????u: "+ startDay);
        System.out.println("Ng??y k???t th??c: "+ endDay);
        System.out.println("Ti???n ?????t c???c tr?????c: " +deposit);
        System.out.println("T???ng ti???n c??n l???i: " + totalPay);
    }
}
