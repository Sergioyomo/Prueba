package boletin1;

public class Mecanico {
		private String nombreCompleto;
		private int tlfno;
		private String especialidad;
		
		public Mecanico(String nombreCompleto, int tlfno, String especialidad) {
			this.nombreCompleto = nombreCompleto;
			this.tlfno = tlfno;
			this.especialidad = especialidad;
		}

		public String getNombreCompleto() {
			return nombreCompleto;
		}

		public void setNombreCompleto(String nombreCompleto) {
			this.nombreCompleto = nombreCompleto;
		}

		public int getTlfno() {
			return tlfno;
		}

		public void setTlfno(int tlfno) {
			this.tlfno = tlfno;
		}

		public String getEspecialidad() {
			return especialidad;
		}

		public void setEspecialidad(String especialidad) {
			this.especialidad = especialidad;
		}

		public String toString() {
			return "Mecanico [nombreCompleto=" + nombreCompleto + ", tlfno=" + tlfno + ", especialidad=" + especialidad
					+ "]";
		}
		
	}
