package com.like.cooperation.team.adapter.out.db.querydsl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.cooperation.team.application.port.in.query.TeamQueryDTO;
import com.like.cooperation.team.application.port.out.TeamQueryRepository;
import com.like.cooperation.team.domain.QTeam;
import com.like.cooperation.team.domain.QTeamMember;
import com.like.cooperation.team.domain.Team;
import com.like.cooperation.team.domain.TeamMember;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class TeamQueryJpaRepository implements TeamQueryRepository {

	private JPAQueryFactory queryFactory;
	private final QTeam qTeam = QTeam.team;
	private final QTeamMember qTeamMember = QTeamMember.teamMember;
	
	public TeamQueryJpaRepository(JPAQueryFactory queryFactory) {
		this.queryFactory = queryFactory;
	}

	@Override
	public List<Team> getTeamList(TeamQueryDTO searchCondition) {

		return queryFactory.selectFrom(qTeam)
						   .where(searchCondition.getCondition())
						   .fetch();						
	}

	@Override
	public List<TeamMember> getTeamMemberList(Long teamId) {
		return queryFactory.selectFrom(qTeamMember)
						   .where(qTeamMember.team.teamId.eq(teamId))
						   .fetch();
	}	
}
