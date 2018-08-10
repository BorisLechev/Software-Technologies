package lognoziroh.bindingModel;

import javax.xml.soap.Text;

public class ReportBindingModel {
	private Text status;

	private Text message;

	private Text origin;

    public Text getStatus() {
        return status;
    }

    public void setStatus(Text status) {
        this.status = status;
    }

    public Text getMessage() {
        return message;
    }

    public void setMessage(Text message) {
        this.message = message;
    }

    public Text getOrigin() {
        return origin;
    }

    public void setOrigin(Text origin) {
        this.origin = origin;
    }
}
