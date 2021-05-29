package dorduncuGunOdev2.entities;

public class Campaign {

	private int CampaignId;
	private String CampaignName;
	
	public Campaign() {
		
	}

	public Campaign(int campaignId, String campaignName) {
		super();
		CampaignId = campaignId;
		CampaignName = campaignName;
	}

	public int getCampaignId() {
		return CampaignId;
	}

	public void setCampaignId(int campaignId) {
		CampaignId = campaignId;
	}

	public String getCampaignName() {
		return CampaignName;
	}

	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}
}
