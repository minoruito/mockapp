package my.company.mockapp.taglibs;

import javax.servlet.jsp.JspException;
import org.springframework.web.servlet.tags.form.InputTag;
import org.springframework.web.servlet.tags.form.TagWriter;

public class ChoumeiDataInputTag extends InputTag {

	private static final long serialVersionUID = 1L;

	protected int writeTagContent(TagWriter tagWriter) throws JspException {
		// クラスを追加
		String cls = this.getCssClass();
		String originalName = this.getName();
		if (cls == null) {
			this.setCssClass("choumeiAjax");
		} else {
			if (cls.indexOf("choumeiAjax") < 0) {
				this.setCssClass(cls + " choumeiAjax");
			}
		}
		super.writeTagContent(tagWriter);

		// 値テキスト
		tagWriter.startTag("input");
		tagWriter.writeAttribute("type", "text");
		tagWriter.writeAttribute("id", originalName + "_value");
		tagWriter.writeAttribute("name", originalName + "_value");
		tagWriter.writeAttribute("readonly", "readonly");
		tagWriter.writeAttribute("value", "");

		writeDefaultAttributes(tagWriter);
		writeValue(tagWriter);

		tagWriter.endTag();
		return SKIP_BODY;
	}

}
