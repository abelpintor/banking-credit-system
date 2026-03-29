package onboarding_project.project.application.usecase.user;

public interface UpdateUserProfileUseCase {
    void execute(UpdateUserProfileRequest request);

    public static record UpdateUserProfileRequest(
        Long userId,
        String name,
        String email,
        String phone
    ) {
    }
}
