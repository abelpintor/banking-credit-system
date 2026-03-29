package onboarding_project.project.application.usecase.auth;

public interface LoginUseCase {
    AuthResponse execute(String email, String password);



    public static record AuthResponse(
        String token
    ) {
    }
}
