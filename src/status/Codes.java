/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package status;

/**
 *
 * @author dougm
 */
public enum Codes {
    ZERO("REJECTED"),ONE("PENDING"),TWO("PROCESSING"),THREE("APPROVED"),FOUR("COMPLETED");
    private String status;
    StatusCode(String status){
    this.status=status;
    }
    public String getStatus(){
        return status;
    }
