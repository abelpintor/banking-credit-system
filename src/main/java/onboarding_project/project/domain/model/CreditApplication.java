package onboarding_project.project.domain.model;

import java.util.Date;

public class CreditApplication {


    private Long id;
    private Client client;
    private CreditType creditType;
    private Float amount;
    private Integer termMonths;
    private Float interestRate;
    private String status;
    private Integer creditScore;
    private User approvedBy;
    private Date approvedAt;
    private Date createdAt;
    private Date updatedAt;
    private Integer version;



    public CreditApplication() {
    }


    public CreditApplication(Long id, Client client, CreditType creditType, Float amount, Integer termMonths,
            Float interestRate, String status, Integer creditScore, User approvedBy, Date approvedAt, Date createdAt,
            Date updatedAt, Integer version) {
        this.id = id;
        this.client = client;
        this.creditType = creditType;
        this.amount = amount;
        this.termMonths = termMonths;
        this.interestRate = interestRate;
        this.status = status;
        this.creditScore = creditScore;
        this.approvedBy = approvedBy;
        this.approvedAt = approvedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.version = version;
    }


    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public CreditType getCreditType() {
        return creditType;
    }
    public void setCreditType(CreditType creditType) {
        this.creditType = creditType;
    }
    public Float getAmount() {
        return amount;
    }
    public void setAmount(Float amount) {
        this.amount = amount;
    }
    public Integer getTermMonths() {
        return termMonths;
    }
    public void setTermMonths(Integer termMonths) {
        this.termMonths = termMonths;
    }
    public Float getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getCreditScore() {
        return creditScore;
    }
    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }
    public User getApprovedBy() {
        return approvedBy;
    }
    public void setApprovedBy(User approvedBy) {
        this.approvedBy = approvedBy;
    }
    public Date getApprovedAt() {
        return approvedAt;
    }
    public void setApprovedAt(Date approvedAt) {
        this.approvedAt = approvedAt;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }


    
    
}
