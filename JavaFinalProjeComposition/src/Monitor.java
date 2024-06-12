
public class Monitor {
    
    private String model;
    
    private String uretici;
    
    private String boyut;
    
    private cözünürlük resolution;

    public Monitor(String model, String uretici, String boyut, cözünürlük resolution) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
    public void monitoru_kapat() {
        
        System.out.println("Monitor Kapatılıyor....");
    }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the boyut
     */
    public String getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    /**
     * @return the resolution
     */
    public cözünürlük getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(cözünürlük resolution) {
        this.resolution = resolution;
    }
    
    
}
