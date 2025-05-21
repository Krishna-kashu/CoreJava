package com.myproject.quickforms.service;

import com.myproject.quickforms.dto.FeedbackDTO;

public class FeedbackServiceImpl implements FeedbackService {
    @Override
    public boolean save(FeedbackDTO feedbackDTO) {
        if(feedbackDTO!=null){

            String name = feedbackDTO.getName();
            if(name!=null && name.length()>3 && name.length()<20){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid!");
            }
        }else{
            return false;
        }
        return true;
    }
}
