package lk.aroComputers.aro.asset.userManagement.entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserSessionLogStatus {
    LOGGED("User Logged"),
    LOGOUT("User Logout"),
    FAILURE("Failure");

    private final String userSessionLogStatus;
}
