package boletin1;

public class Mecanico {
	/**Nombre completo del mecanico*/
		private String nombreCompleto;
		/**El telefono del mecanico*/
		private int tlfno;
		/**La especialidad del mecanico*/
		private String especialidad;
		/**
		 * Constructor del mecanico
		 * @param nombreCompleto
		 * @param tlfno
		 * @param especialidad
		 */
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
