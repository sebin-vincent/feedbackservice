package com.example.feedbackservice.responsedto;

public class FeedbackResponse {


    private int feedbackId;

    private String feedbackMsg;

    private String customerName;

    public FeedbackResponse() {
    }

    public FeedbackResponse(int feedbackId, String feedbackMsg, String customerName) {
        this.feedbackId = feedbackId;
        this.feedbackMsg = feedbackMsg;
        this.customerName = customerName;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedbackMsg() {
        return feedbackMsg;
    }

    public void setFeedbackMsg(String feedbackMsg) {
        this.feedbackMsg = feedbackMsg;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
