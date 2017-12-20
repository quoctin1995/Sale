package com.tma.service.postgresql;

import com.tma.entity.postgresql.Role;

public interface RoleService {
	void saveRole(Role role);

	Role findByName(String nameRole);
}
