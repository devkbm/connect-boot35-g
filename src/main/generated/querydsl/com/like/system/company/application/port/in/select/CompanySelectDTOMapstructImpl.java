package com.like.system.company.application.port.in.select;

import com.like.system.company.domain.CompanyInfo;
import com.like.system.company.domain.CompanyInfoId;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-19T15:30:01+0900",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class CompanySelectDTOMapstructImpl implements CompanySelectDTOMapstruct {

    @Override
    public CompanySelectDTO toDTO(CompanyInfo entity) {

        CompanySelectDTO.CompanySelectDTOBuilder companySelectDTO = CompanySelectDTO.builder();

        if ( entity != null ) {
            companySelectDTO.companyCode( entityIdCompanyCode( entity ) );
            companySelectDTO.companyName( entity.getCompanyName() );
            companySelectDTO.businessRegistrationNumber( entity.getBusinessRegistrationNumber() );
            companySelectDTO.coporationNumber( entity.getCoporationNumber() );
            companySelectDTO.nameOfRepresentative( entity.getNameOfRepresentative() );
            companySelectDTO.establishmentDate( entity.getEstablishmentDate() );
        }

        return companySelectDTO.build();
    }

    private String entityIdCompanyCode(CompanyInfo companyInfo) {
        CompanyInfoId id = companyInfo.getId();
        if ( id == null ) {
            return null;
        }
        return id.getCompanyCode();
    }
}
