package com.like.system.company.application.port.in.save;

import com.like.system.company.domain.CompanyInfo;
import com.like.system.company.domain.CompanyInfoId;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-19T15:30:01+0900",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class CompanySaveDTOMapstructImpl implements CompanySaveDTOMapstruct {

    @Override
    public CompanyInfo toEntity(CompanySaveDTO dto) {

        String id = null;
        String companyName = null;
        String businessRegistrationNumber = null;
        String coporationNumber = null;
        String nameOfRepresentative = null;
        LocalDate establishmentDate = null;
        if ( dto != null ) {
            id = dto.companyCode();
            companyName = dto.companyName();
            businessRegistrationNumber = dto.businessRegistrationNumber();
            coporationNumber = dto.coporationNumber();
            nameOfRepresentative = dto.nameOfRepresentative();
            establishmentDate = dto.establishmentDate();
        }

        String appUrl = null;

        CompanyInfo companyInfo = new CompanyInfo( appUrl, id, companyName, businessRegistrationNumber, coporationNumber, nameOfRepresentative, establishmentDate );

        return companyInfo;
    }

    @Override
    public CompanySaveDTO toDTO(CompanyInfo entity) {

        CompanySaveDTO.CompanySaveDTOBuilder companySaveDTO = CompanySaveDTO.builder();

        if ( entity != null ) {
            companySaveDTO.companyCode( entityIdCompanyCode( entity ) );
            companySaveDTO.companyName( entity.getCompanyName() );
            companySaveDTO.businessRegistrationNumber( entity.getBusinessRegistrationNumber() );
            companySaveDTO.coporationNumber( entity.getCoporationNumber() );
            companySaveDTO.nameOfRepresentative( entity.getNameOfRepresentative() );
            companySaveDTO.establishmentDate( entity.getEstablishmentDate() );
        }

        return companySaveDTO.build();
    }

    private String entityIdCompanyCode(CompanyInfo companyInfo) {
        CompanyInfoId id = companyInfo.getId();
        if ( id == null ) {
            return null;
        }
        return id.getCompanyCode();
    }
}
