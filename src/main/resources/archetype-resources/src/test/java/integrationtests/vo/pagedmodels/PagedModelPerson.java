#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.integrationtests.vo.pagedmodels;

import java.util.List;

import ${package}.integrationtests.vo.PersonVO;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PagedModelPerson {

	@XmlElement(name = "content")
	private List<PersonVO> content;

	public PagedModelPerson() {}

	public List<PersonVO> getContent() {
		return content;
	}

	public void setContent(List<PersonVO> content) {
		this.content = content;
	}
}
