package onboarding_project.project.application.usecase;


public interface CreditApplicationService {


    public void rejectCreditApplication(Long applicationId);

    public Double calculateCreditScore(Long clientId);


}