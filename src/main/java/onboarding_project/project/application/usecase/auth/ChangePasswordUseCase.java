package onboarding_project.project.application.usecase.auth;

public interface ChangePasswordUseCase {
    
    void execute(ChangePasswordRequest request);


    public static record ChangePasswordRequest(
        String email,
        String oldPassword,
        String newPassword
    ) {
    }
}
