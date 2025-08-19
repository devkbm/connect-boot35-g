package com.like.system.menu_role.adapter.out.db.role.jpa;

import com.like.system.menu_role.domain.role.Role;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-19T15:30:01+0900",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class RoleEntityMapperImpl implements RoleEntityMapper {

    @Override
    public Role toEntity(RoleJpaEntity jpaEntity) {

        String companyCode = null;
        String roleCode = null;
        String roleName = null;
        String description = null;
        String menuGroupCode = null;
        if ( jpaEntity != null ) {
            companyCode = jpaEntity.getCompanyCode();
            roleCode = jpaEntity.getRoleCode();
            roleName = jpaEntity.getRoleName();
            description = jpaEntity.getDescription();
            menuGroupCode = jpaEntity.getMenuGroupCode();
        }

        String appUrl = null;

        Role role = new Role( appUrl, companyCode, roleCode, roleName, description, menuGroupCode );

        return role;
    }

    @Override
    public RoleJpaEntity toJpaEntity(Role entity) {

        String companyCode = null;
        String roleCode = null;
        String roleName = null;
        String description = null;
        String menuGroupCode = null;
        if ( entity != null ) {
            companyCode = entity.getCompanyCode();
            roleCode = entity.getRoleCode();
            roleName = entity.getRoleName();
            description = entity.getDescription();
            menuGroupCode = entity.getMenuGroupCode();
        }

        RoleJpaEntity roleJpaEntity = new RoleJpaEntity( companyCode, roleCode, roleName, description, menuGroupCode );

        if ( entity != null ) {
            roleJpaEntity.setAppUrl( entity.getAppUrl() );
        }

        return roleJpaEntity;
    }
}
