package javatar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//User OneToMany FavouritePart
@Entity
public class FavouritePart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer userId;

	private String partName;
	private String partBrand;
	private String partId;
	private String partLink;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPartBrand() {
		return partBrand;
	}

	public void setPartBrand(String partBrand) {
		this.partBrand = partBrand;
	}

	public String getPartId() {
		return partId;
	}

	public void setPartId(String partId) {
		this.partId = partId;
	}

	public String getPartLink() {
		return partLink;
	}

	public void setPartLink(String partLink) {
		this.partLink = partLink;
	}
}
