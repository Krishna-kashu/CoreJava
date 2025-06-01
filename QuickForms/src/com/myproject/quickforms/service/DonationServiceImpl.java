package com.myproject.quickforms.service;

import com.myproject.quickforms.dto.DonationDTO;

public class DonationServiceImpl implements DonationService{

    public DonationServiceImpl(){
        System.out.println("no argument constructor of DonationServiceImpl");
    }
    @Override
    public boolean save(DonationDTO donationDTO) {

        if(donationDTO!=null){

            String name= donationDTO.getName();;
            if(name!=null && name.length()>=3 && name.length()<20){
                System.out.println("valid");
            }else{
                System.out.println("invalid!");
                return false;
            }

        }else{
            System.out.println("Donation can not be null");
            return false;
        }
        return true;
    }
}