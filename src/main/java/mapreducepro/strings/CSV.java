package mapreducepro.strings;

public enum CSV {
    PASSENGER_DATA("AComp_Passenger_data.csv"),
    PASSENGER_DATA_NO_ERROR("AComp_Passenger_data_no_error.csv"),
    PASSENGER_DATA_NO_ERROR_DATETIME("AComp_Passenger_data.csv"),
    TOP_30("Top30_airports_LatLong.csv");

    private String fileName;
    private String path;

    private CSV(String fileName) {
        this.fileName = fileName;
        this.path = "csv/" + fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getClasspath() {
        return path;
    }
}
