package com.tantum.app.tantum.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConstraintChecker {

	public static void checkCargaHorariaMaxima(Settings settings, Semestre semestre) throws ConstraintException {
		int count = semestre.getDisciplinas().stream().mapToInt(Disciplina::getAulas).sum();
		if (count > settings.getCargaHorariaMaxima()) {
			throw new ConstraintException();
		}
	}

	public static void checkCargaHorariaMinima(Settings settings, Semestre semestre) throws ConstraintException {
		int count = semestre.getDisciplinas().stream().mapToInt(Disciplina::getAulas).sum();
		if (count < settings.getCargaHorariaMinima()) {
			throw new ConstraintException();
		}
	}

}
