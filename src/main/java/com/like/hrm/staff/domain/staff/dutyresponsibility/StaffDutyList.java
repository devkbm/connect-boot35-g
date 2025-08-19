package com.like.hrm.staff.domain.staff.dutyresponsibility;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

import com.like.hrm.staff.domain.staff.Staff;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Embeddable
public class StaffDutyList {

	@OrderBy("seq asc")
	@OneToMany(mappedBy = "staff", fetch = FetchType.LAZY)
	Set<StaffDuty> staffDutyList = new LinkedHashSet<>();
		
	public StaffDuty get(Staff staff, Long seq) {
		
		return this.staffDutyList.stream()
								 .filter(e -> e.getId().equals(new StaffDutyId(staff, seq)))
								 .findFirst()
								 .orElse(null);
				
	}
		
	public void remove(Staff staff, Long seq) {
		this.staffDutyList.removeIf(e -> e.getId().equals(new StaffDutyId(staff, seq)));
	}
	
	void add(StaffDuty entity) {
		if (this.staffDutyList == null) {
			this.staffDutyList = new LinkedHashSet<>();
		}
		
		if (!this.staffDutyList.contains(entity)) {
			this.staffDutyList.add(entity);
		}			
	}
	
	long getNextSeq() {
		long maxSeq = 0;
		
		if (this.staffDutyList == null || this.staffDutyList.isEmpty()) {
			maxSeq = 0;
		} else {			
			maxSeq = staffDutyList.stream()
								  .mapToLong(e -> e.getId().getSeq())
							  	  .max()
							  	  .getAsLong();
			
		}
					
		return maxSeq + 1;
	}
	
	public Stream<StaffDuty> stream() {
		return this.staffDutyList.stream();
	}
}
