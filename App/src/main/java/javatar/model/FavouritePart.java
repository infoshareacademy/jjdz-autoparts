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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		FavouritePart that = (FavouritePart) o;

		if (userId != that.userId) return false;
		if (partName != null ? !partName.equals(that.partName) : that.partName != null) return false;
		if (partBrand != null ? !partBrand.equals(that.partBrand) : that.partBrand != null) return false;
		if (partId != null ? !partId.equals(that.partId) : that.partId != null) return false;
		return partLink != null ? partLink.equals(that.partLink) : that.partLink == null;

	}

	@Override
	public int hashCode() {
		int result = (int) (userId ^ (userId >>> 32));
		result = 31 * result + (partName != null ? partName.hashCode() : 0);
		result = 31 * result + (partBrand != null ? partBrand.hashCode() : 0);
		result = 31 * result + (partId != null ? partId.hashCode() : 0);
		result = 31 * result + (partLink != null ? partLink.hashCode() : 0);
		return result;
	}
}
