package com.like.core.jpa.domain;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.metamodel.spi.ValueAccess;
import org.hibernate.usertype.CompositeUserType;

public class AuditorDetailsType implements CompositeUserType<AuditorDetails> {

	public static class AuditorDetailsMapper {
		String loggedUser;
		String hostIp;						   	  
	}
	
	@Override
	public Class<?> embeddable() {
		return AuditorDetailsMapper.class;
	}
	
	@Override
	public Class<AuditorDetails> returnedClass() {
		return AuditorDetails.class;
	}

	@Override
	public AuditorDetails instantiate(ValueAccess values, SessionFactoryImplementor sessionFactory) {
		final String loggedUser = values.getValue( 1, String.class );
		final String hostIp = values.getValue( 0, String.class );		
		return new AuditorDetails(loggedUser, hostIp);
	}
	
	@Override
	public Object getPropertyValue(AuditorDetails component, int property) throws HibernateException {
		switch ( property ) {
			case 1:
				return component.getLoggedUser();
			case 0:
				return component.getHostIp();
		}
		return null;
	}

	@Override
	public boolean equals(AuditorDetails x, AuditorDetails y) {
		return x == y || x != null && Objects.equals( x.getLoggedUser(), y.getLoggedUser() ) && Objects.equals( x.getHostIp(), y.getHostIp() );
	}

	@Override
	public int hashCode(AuditorDetails x) {
		return Objects.hash( x.getLoggedUser(), x.getHostIp() );
	}

	@Override
	public AuditorDetails deepCopy(AuditorDetails value) {
		return value; // immutable
	}

	@Override
	public boolean isMutable() {		
		return false;
	}

	@Override
	public Serializable disassemble(AuditorDetails value) {
		return new String[] { value.getLoggedUser(), value.getHostIp() };

	}

	@Override
	public AuditorDetails assemble(Serializable cached, Object owner) {
		final String[] parts = (String[]) cached;
		return new AuditorDetails( parts[0], parts[1] );
	}

	@Override
	public AuditorDetails replace(AuditorDetails detached, AuditorDetails managed, Object owner) {
		return detached;
	}
	
}