package onboarding_project.project.application.DTO;

public record ApplyCreditRequest(
    Long clientId,
    Long creditTypeId,
    Double amount,
    Integer termMonths
    
) {
}