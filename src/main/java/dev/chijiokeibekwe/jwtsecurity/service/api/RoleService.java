package dev.chijiokeibekwe.jwtsecurity.service.api;

import dev.chijiokeibekwe.jwtsecurity.entity.Role;
import dev.chijiokeibekwe.jwtsecurity.enums.UserType;

public interface RoleService {

    Role getRoleByUserType(UserType userType);
}
