package onboarding_project.project.domain.model;

public class CreditType {
    


    private Long id;
    private String name;
    private Float baseInterestRate;
    private Float maxAmount;
    private Integer maxTermMonths;


    public CreditType() {
    }

    public CreditType(Long id, String name, Float baseInterestRate, Float maxAmount, Integer maxTermMonths) {
        this.id = id;
        this.name = name;
        this.baseInterestRate = baseInterestRate;
        this.maxAmount = maxAmount;
        this.maxTermMonths = maxTermMonths;
    }


    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Float getBaseInterestRate() {
        return baseInterestRate;
    }
    public void setBaseInterestRate(Float baseInterestRate) {
        this.baseInterestRate = baseInterestRate;
    }
    public Float getMaxAmount() {
        return maxAmount;
    }
    public void setMaxAmount(Float maxAmount) {
        this.maxAmount = maxAmount;
    }
    public Integer getMaxTermMonths() {
        return maxTermMonths;
    }
    public void setMaxTermMonths(Integer maxTermMonths) {
        this.maxTermMonths = maxTermMonths;
    }






    

}
