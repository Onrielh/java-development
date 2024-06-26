package com.plurasight;

public class CellPhone {
        //Scanner scanner = new Scanner(System.in);
        private Long serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;
        public CellPhone() {
            serialNumber = 0L;
            model = "";
            carrier = "";
            phoneNumber = "";
            owner = "";
        }
        // create overload constructor
     public CellPhone(Long serialNumber, String model, String carrier, String phoneNumber, String owner) {
         this.serialNumber = serialNumber;
         this.model = model;
         this.carrier = carrier;
         this.phoneNumber = phoneNumber;
         this.owner = owner;
     }
     // setters
    public void  setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }public void setModel(String model) {
        this.model = model;
    }public void setCarrier(String carrier) {
        this.carrier = carrier;
    }public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }public void setOwner(String owner) {
        this.owner = owner;
    }

    //  getters
    public Long getSerialNumber() {
        return serialNumber;
    }
    public String getModel() {
        return model;
    }public String getPhoneNumber() {
        return phoneNumber;
    }public String getCarrier() {
        return carrier;
    }public String getOwner() {
        return owner;
    }
    public void dial( String phoneNumber){
        System.out.println(owner + "phone is calling"+ phoneNumber);

    }
    public void dial (CellPhone phone){
        System.out.println(owner +""+"s phone is calling" + phone.phoneNumber);
    }
}




