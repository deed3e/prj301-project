/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pallgree
 */
public class stores {
    private String stor_id;
    private String stor_name;
    private String stor_address;
    private String city;
    private String state;
    private String zip;
    private String username;
    private String password;


    public stores() {
    }

    @Override
    public String toString() {
        return "stores{" + "stor_id=" + stor_id + ", stor_name=" + stor_name + ", stor_address=" + stor_address + ", city=" + city + ", state=" + state + ", zip=" + zip + '}';
    }

    public stores(String stor_id, String stor_name, String stor_address, String city, String state, String zip) {
        this.stor_id = stor_id;
        this.stor_name = stor_name;
        this.stor_address = stor_address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public stores(String stor_id, String stor_name, String stor_address, String city, String state, String zip, String username, String password) {
        this.stor_id = stor_id;
        this.stor_name = stor_name;
        this.stor_address = stor_address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.username = username;
        this.password = password;
    }
    
    public String getStor_id() {
        return stor_id;
    }

    public void setStor_id(String stor_id) {
        this.stor_id = stor_id;
    }

    public String getStor_name() {
        return stor_name;
    }

    public void setStor_name(String stor_name) {
        this.stor_name = stor_name;
    }

    public String getStor_address() {
        return stor_address;
    }

    public void setStor_address(String stor_address) {
        this.stor_address = stor_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
}
