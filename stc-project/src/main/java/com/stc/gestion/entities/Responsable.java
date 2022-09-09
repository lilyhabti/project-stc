package com.stc.gestion.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name="responsables")
public class Responsable extends AppUser {
	
	private String domaine;
	private String type;
	private String etat;

	@OneToMany(mappedBy="responsable")
//	@JsonIgnore
    private Collection<Activite> activities;
}
