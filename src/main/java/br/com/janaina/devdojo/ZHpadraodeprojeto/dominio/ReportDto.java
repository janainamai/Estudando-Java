package br.com.janaina.devdojo.ZHpadraodeprojeto.dominio;
 
public class ReportDto {
	private String airplaneName;
	private Country country;
	private Currency currency;
	private String personName;
	
	public static final class ReportDtoBuilder {
		private String airplaneName;
		private Country country;
		private Currency currency;
		private String personName;
		
		private ReportDtoBuilder() {
		}
		
		public static ReportDtoBuilder build() {
			return new ReportDtoBuilder();
		}
		
		public ReportDtoBuilder airplaneName(String airplaneName) {
			this.airplaneName = airplaneName;
			return this;
		}
		
		public ReportDtoBuilder country(Country country) {
			this.country = country;
			return this;
		}
		
		public ReportDtoBuilder currency(Currency currency) {
			this.currency = currency;
			return this;
		}
		
		public ReportDtoBuilder personName(String personName) {
			this.personName = personName;
			return this;
		}

		@Override
		public String toString() {
			return "ReportDtoBuilder [airplaneName=" + airplaneName + ", country=" + country + ", currency=" + currency
					+ ", personName=" + personName + "]";
		}
		
		
	}
}
