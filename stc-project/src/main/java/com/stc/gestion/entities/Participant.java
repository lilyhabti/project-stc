package com.stc.gestion.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="participants")
public class Participant extends AppUser {
	
	private String domaine;
	private String structure;
	
	@ManyToMany(mappedBy="participants")
//	@JsonIgnore
	private Collection<Activite> activities = new ArrayList<>();
}
