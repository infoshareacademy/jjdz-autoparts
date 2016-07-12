package javatar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FavouritePart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private long userId;

	private String partName;
	private String partBrand;
	private String partId;
	private String partLink;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
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

	@Override
	public String toString() {
		return "FavouritePart{" +
				"id=" + id +
				", userId=" + userId +
				", partName='" + partName + '\'' +
				", partBrand='" + partBrand + '\'' +
				", partId='" + partId + '\'' +
				", partLink='" + partLink + '\'' +
				'}';
	}
}
