/*
package com.eco.uitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationProgramInterfaceHelper {

    String buildingID = null;
    String ApplcationID = null;
    List<String> buildingIDTemp = new ArrayList();
    List<String> FinancialIDTemp = new ArrayList();
    List<String> customerIDTemp = new ArrayList();
    List<String> catalogIDTemp = new ArrayList();
    String customerID = null;
    long epoch = System.currentTimeMillis();
    String catalogID = null;
    List<String> projectID = new ArrayList<>();
    List<String> projectID1 = new ArrayList<>();
    List<String> projectID2 = new ArrayList<>();
    List<String> projectID3 = new ArrayList<>();
    public void deleteBuilding()
    {
         RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOmFkbWluMTIz").
                                        header("Content-Type","application/json").
                                        header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36\" -H \"OData-Version: 4.0\" -H \"X-APPVERSION: 2011/08\" -H \"Origin: https://eiappdev.azurewebsites.net\" -H \"Sec-Fetch-Site: cross-site").
                                        when().delete("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings("+buildingID+")").then().log().all().assertThat().statusCode(204);
    }

    public void deleteBuildingLaborPull()
    {
        RestAssured.given().header("Authorization","Basic YXV0b21hdGlvbi51c2VyQGVjb2luc2lnaHQuY29tOmFkbWluMTIzOmU3MmE1MGJiLWM5OTQtNDU2ZC1hNjQ2LTMzNDViM2Q1N2MxYg==").
                header("Content-Type","application/json").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36\" -H \"OData-Version: 4.0\" -H \"X-APPVERSION: 2011/08\" -H \"Origin: https://eiappdev.azurewebsites.net\" -H \"Sec-Fetch-Site: cross-site").
                when().delete("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings("+buildingID+")").then().log().all().assertThat().statusCode(204);
    }

    @Test
    public void deleteCustomer()
    {
        RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOmFkbWluMTIz").
                header("Content-Type","application/json").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36\" -H \"OData-Version: 4.0\" -H \"X-APPVERSION: 2011/08\" -H \"Origin: https://eiappdev.azurewebsites.net\" -H \"Sec-Fetch-Site: cross-site").
                when().delete("https://eiapidev.azurewebsites.net/v1/audit/Customers("+customerID+")").then().log().all().assertThat().statusCode(204);
    }

    @Test
    public void getBuidling()
    {
        Response response = RestAssured.given().header("Authorization","Basic U2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
                header("Content-Type","application/json").
                body("{\"EntityType\":\"Building\",\"SkipCount\":0,\"IsArchivedSelected\":false,\"SearchString\":\"ecoinsight_sateesh_QA23\"}").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36\" -H \"OData-Version: 4.0\" -H \"X-APPVERSION: 2011/08\" -H \"Origin: https://eiappdev.azurewebsites.net\" -H \"Sec-Fetch-Site: cross-site").
                then().log().all().when().post("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings(00000000-0000-0000-0000-000000000000)/Audit.BuildingFilterResult");
        System.out.println("the id of the building is"+response.path("BuildingList.Id"));
        buildingIDTemp = response.path("BuildingList.Id");
        buildingID = buildingIDTemp.get(0);
    }

    @Test
    public void getBuidlingForLabor()
    {
        Response response = RestAssured.given().header("Authorization","Basic YXV0b21hdGlvbi51c2VyQGVjb2luc2lnaHQuY29tOmFkbWluMTIzOmU3MmE1MGJiLWM5OTQtNDU2ZC1hNjQ2LTMzNDViM2Q1N2MxYg==").
                header("Content-Type","application/json").
                body("{\"EntityType\":\"Building\",\"SkipCount\":0,\"IsArchivedSelected\":false,\"SearchString\":\"ecoinsight_Labor_Company_Table\"}").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36\" -H \"OData-Version: 4.0\" -H \"X-APPVERSION: 2011/08\" -H \"Origin: https://eiappdev.azurewebsites.net\" -H \"Sec-Fetch-Site: cross-site").
                then().log().all().when().post("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings(00000000-0000-0000-0000-000000000000)/Audit.BuildingFilterResult");
        System.out.println("the id of the building is"+response.path("BuildingList.Id"));
        buildingIDTemp = response.path("BuildingList.Id");
        buildingID = buildingIDTemp.get(0);
    }

    @Test
    public void getCustomer()
    {
        Response response = RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOmFkbWluMTIz").
                queryParam("$orderby","Modified desc").queryParam("$expand","CustomerOwner").queryParam("$filter","( contains(Name,  'satish_QA_ecoinsight2345' ) or contains(Address/Street,  'satish_QA_ecoinsight2345' ) or contains(Address/Extended,  'satish_QA_ecoinsight2345' ) or contains(Address/City,  'satish_QA_ecoinsight2345' ) or contains(Address/State,  'satish_QA_ecoinsight2345' ))").queryParam("t",epoch).header("Content-Type","application/json").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36\" -H \"OData-Version: 4.0\" -H \"X-APPVERSION: 2011/08\" -H \"Origin: https://eiappdev.azurewebsites.net\" -H \"Sec-Fetch-Site: cross-site").
                then().log().all().when().get("https://eiapidev.azurewebsites.net/v1/audit/Customers");
        customerIDTemp = response.path("value.Id");
        customerID = customerIDTemp.get(0);
    }

    @Test
    public void deleteFilters()
    {
         RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOmFkbWluMTIz").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").
                    contentType("application/json").body("{\"FilterOption\":\"All\",\"SearchJson\":\"\",\"IsDeleted\":true}").when().post("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings(060bcc0d-6b8b-4206-b6b0-72266fef7385)/Specifications(cbef7b77-bf60-4728-92e5-158096ab5d80)/LineItemFilters").then().
                    log().all().assertThat().statusCode(204);
    }

    @Test
    public String getCatalogFixtures()
    {
        Response response = RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOmFkbWluMTIz").queryParam("source","CatalogAdmin").
                queryParam("$orderby","Modified desc").queryParam("t",epoch).
            header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").
                contentType("application/json").then().log().all().when()
                    .get("https://eiapidev.azurewebsites.net/v1/audit/ProductCatalogs(49b4f735-ff15-49fe-bc4c-e7ffb69ee890)/CatalogFixtures");
        catalogIDTemp = response.path("Id");
        catalogID = catalogIDTemp.get(0);
        return catalogID;
    }

    @Test
    public void deleteCatalogFixture()

    {
        System.out.println("catalogID"+catalogID);
        Response response = RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOmFkbWluMTIz").queryParam("source","CatalogAdmin").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").then().log().all().when()
                .delete("https://eiapidev.azurewebsites.net/v1/audit/ProductCatalogs(49b4f735-ff15-49fe-bc4c-e7ffb69ee890)/CatalogFixtures("+catalogID+")");
    }

    @Test
    public void searchProject()
    {
        Response response = RestAssured.given().header("Authorization","Basic QXV0b21hdGlvbi51c2VyQGVjb2luc2lnaHQuY29tOmFkbWluMTIzOmU3MmE1MGJiLWM5OTQtNDU2ZC1hNjQ2LTMzNDViM2Q1N2MxYg==")
                        .contentType("application/json;odata.metadata=minimal").body("{\"SkipCount\":0,\"IsArchivedSelected\":false,\"SearchString\":\"Automation Test\"}").header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").then().log().all().when()
                            .post("https://eiapidev.azurewebsites.net/v1/audit/Buildings(00000000-0000-0000-0000-000000000000)/Audit.SmartSpecProjectList");
        projectID = response.path("BuildingList.BuildingId");
    }

    @Test
    public void searchProjectTS()
    {
        Response response = RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl")
                .contentType("application/json;odata.metadata=minimal").body("{\"SkipCount\":0,\"IsArchivedSelected\":false,\"SearchString\":\"TS\"}").header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").then().log().all().when()
                .post("https://eiapidev.azurewebsites.net/v1/audit/Buildings(00000000-0000-0000-0000-000000000000)/Audit.SmartSpecProjectList");
        projectID3 = response.path("BuildingList.BuildingId");
        System.out.println(projectID3);
    }

    @Test
    public void deleteProject()
    {
        searchProjectTS();
        try{
            Response response = RestAssured.given().contentType("application/json;odata.metadata=minimal").header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
                    header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").then().log().all().when()
                    .delete("https://eiapidev.azurewebsites.net/v1/audit/Buildings("+projectID3.get(0)+")");
        }
    	catch (IndexOutOfBoundsException e)
        {
            System.out.println("Passed the try catch block");
        }
    }
@Test
public void DownloadSampleReport(){
//    RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
//            header("Content-Type","application/json;odata.metadata=minimal").body("{\"BuildingId\":\"00000000-0000-0000-0000-000000000000\",\"SpecificationId\":\"00000000-0000-0000-0000-000000000000\"}").
//            header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36").
//            when().post("https://eiapidev.azurewebsites.net/v1/Audit/ReportDefinitions(f65df722-9416-40fd-b41c-007ef723de16)/Audit.GenerateProposal?t").then().log().all().assertThat().statusCode(200);

    RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
            header("Content-Type","application/json;odata.metadata=minimal").body("{\"BuildingId\":\"00000000-0000-0000-0000-000000000000\",\"SpecificationId\":\"00000000-0000-0000-0000-000000000000\"}").
            header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36").
            when().post("https://eiapidev.azurewebsites.net/v1/Audit/ReportDefinitions(f65df722-9416-40fd-b41c-007ef723de16)/Audit.GenerateProposal?t").then().log().all().assertThat().statusCode(200);

    System.out.println("success-English_GTemplate_DNT_Automation");

    RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
            header("Content-Type","application/json;odata.metadata=minimal").body("{\"BuildingId\":\"00000000-0000-0000-0000-000000000000\",\"SpecificationId\":\"00000000-0000-0000-0000-000000000000\"}").
            header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36").
            when().post("https://eiapidev.azurewebsites.net/v1/Audit/ReportDefinitions(4db9135a-6929-411d-ba91-1bac5b34dbd3)/Audit.GenerateProposal?t").then().log().all().assertThat().statusCode(200);

    System.out.println("success-French_GTemplate_DNT_Automation");

    RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
            header("Content-Type","application/json;odata.metadata=minimal").body("{\"BuildingId\":\"00000000-0000-0000-0000-000000000000\",\"SpecificationId\":\"00000000-0000-0000-0000-000000000000\"}").
            header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36").
            when().post("https://eiapidev.azurewebsites.net/v1/Audit/ReportDefinitions(10013858-7831-4a87-859f-ffb1f14d6210)/Audit.GenerateProposal?t").then().log().all().assertThat().statusCode(200);

    System.out.println("success-LegacyEnglish_GTemplate_DNT_Automation");

    RestAssured.given().header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
            header("Content-Type","application/json;odata.metadata=minimal").body("{\"BuildingId\":\"00000000-0000-0000-0000-000000000000\",\"SpecificationId\":\"00000000-0000-0000-0000-000000000000\"}").
            header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36").
            when().post("https://eiapidev.azurewebsites.net/v1/Audit/ReportDefinitions(96a96629-9ba5-40d7-861c-9d421a3bfb64)/Audit.GenerateProposal?t").then().log().all().assertThat().statusCode(200);

    System.out.println("success-LegacyFrench_GTemplate_DNT_Automation");

}
    @Test
    public void searchProjectCopyDown()
    {
        Response response = RestAssured.given().header("Authorization","Basic QXV0b21hdGlvbi51c2VyQGVjb2luc2lnaHQuY29tOmFkbWluMTIzOmU3MmE1MGJiLWM5OTQtNDU2ZC1hNjQ2LTMzNDViM2Q1N2MxYg==")
                .contentType("application/json;odata.metadata=minimal").body("{\"SkipCount\":0,\"IsArchivedSelected\":false,\"SearchString\":\"copyDown\"}").header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").then().log().all().when()
                .post("https://eiapidev.azurewebsites.net/v1/audit/Buildings(00000000-0000-0000-0000-000000000000)/Audit.SmartSpecProjectList");
        projectID1 = response.path("BuildingList.BuildingId");
    }

    @Test
    public void deleteProjectCopyDown()
    {
        try{
            Response response = RestAssured.given().contentType("application/json;odata.metadata=minimal").header("Authorization","Basic QXV0b21hdGlvbi51c2VyQGVjb2luc2lnaHQuY29tOmFkbWluMTIzOmU3MmE1MGJiLWM5OTQtNDU2ZC1hNjQ2LTMzNDViM2Q1N2MxYg==").
                    header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").then().log().all().when()
                    .delete("https://eiapidev.azurewebsites.net/v1/audit/Buildings("+projectID1.get(0)+")");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Passed the try catch");
        }

    }

    @Test
    public void searchProjectRU()
    {
        Response response = RestAssured.given().header("Authorization","Basic QXV0b21hdGlvbi51c2VyQGVjb2luc2lnaHQuY29tOmFkbWluMTIzOmU3MmE1MGJiLWM5OTQtNDU2ZC1hNjQ2LTMzNDViM2Q1N2MxYg==")
                .contentType("application/json;odata.metadata=minimal").body("{\"SkipCount\":0,\"IsArchivedSelected\":false,\"SearchString\":\"RecentlyUsed\"}").header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").then().log().all().when()
                .post("https://eiapidev.azurewebsites.net/v1/audit/Buildings(00000000-0000-0000-0000-000000000000)/Audit.SmartSpecProjectList");
        projectID2 = response.path("BuildingList.BuildingId");
    }

    @Test
    public void deleteProjectRU()
    {
        try{
            Response response = RestAssured.given().contentType("application/json;odata.metadata=minimal").header("Authorization","Basic QXV0b21hdGlvbi51c2VyQGVjb2luc2lnaHQuY29tOmFkbWluMTIzOmU3MmE1MGJiLWM5OTQtNDU2ZC1hNjQ2LTMzNDViM2Q1N2MxYg==").
                    header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").then().log().all().when()
                    .delete("https://eiapidev.azurewebsites.net/v1/audit/Buildings("+projectID2.get(0)+")");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Passed the try catch");
        }

    }

    @Test
    public void setDetailedLabor()
    {
        Response response = RestAssured.given().contentType("application/json;odata.metadata=minimal").header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").body("{\"LaborView\":\"Detailed\"}").then().log().all().when()
                .patch("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings(e5fc5eac-93a3-4775-9236-2f142d076924)/FinancialAssumptions(399ca24a-d456-4bda-828f-d1e9f4daeaaf)");
    }

    @Test
    public void setTimeBased()
    {
        getBuidling();
        Response response = RestAssured.given().contentType("application/json;odata.metadata=minimal").header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").body("{\"LaborCalculationMethod\":\"PerHour\"}").then().log().all().when()
                .patch("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings("+buildingID+")/FinancialAssumptions("+ApplcationID+")");
    }

    @Test
    public void setUnitBased()
    {
        getBuidling();
        getFinancialAssumption();
        Response response = RestAssured.given().contentType("application/json;odata.metadata=minimal").header("Authorization","Basic c2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").body("{\"LaborCalculationMethod\":\"PerUnit\"}").then().log().all().when()
                .patch("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings("+buildingID+")/FinancialAssumptions("+ApplcationID+")");
    }

    @Test
    public void setUnitBasedForLabor()
    {
        getBuidlingForLabor();
        getFinancialAssumptionForLabor();
        Response response = RestAssured.given().contentType("application/json;odata.metadata=minimal").header("Authorization","Basic YXV0b21hdGlvbi51c2VyQGVjb2luc2lnaHQuY29tOmFkbWluMTIzOmU3MmE1MGJiLWM5OTQtNDU2ZC1hNjQ2LTMzNDViM2Q1N2MxYg==").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").body("{\"LaborCalculationMethod\":\"PerUnit\"}").then().log().all().when()
                .patch("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings("+buildingID+")/FinancialAssumptions("+ApplcationID+")");
    }


    @Test
    public void getFinancialAssumption()
    {
        getBuidling();
        Response response = RestAssured.given().header("Authorization","Basic U2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
                header("Content-Type","application/json").queryParam("t",epoch).
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36\" -H \"OData-Version: 4.0\" -H \"X-APPVERSION: 2011/08\" -H \"Origin: https://eiappdev.azurewebsites.net\" -H \"Sec-Fetch-Site: cross-site").
                then().log().all().when().get("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings("+buildingID+")/Audit.GetBuildingBasicInfo");
        FinancialIDTemp = response.path("FinancialAssumptions.Id");
        ApplcationID = FinancialIDTemp.get(0);
        System.out.println(ApplcationID);
    }

    @Test
    public void getFinancialAssumptionForLabor()
    {
        getBuidlingForLabor();
        Response response = RestAssured.given().header("Authorization","Basic YXV0b21hdGlvbi51c2VyQGVjb2luc2lnaHQuY29tOmFkbWluMTIzOmU3MmE1MGJiLWM5OTQtNDU2ZC1hNjQ2LTMzNDViM2Q1N2MxYg==").
                header("Content-Type","application/json").queryParam("t",epoch).
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36\" -H \"OData-Version: 4.0\" -H \"X-APPVERSION: 2011/08\" -H \"Origin: https://eiappdev.azurewebsites.net\" -H \"Sec-Fetch-Site: cross-site").
                then().log().all().when().get("https://eiapidev.azurewebsites.net/v1/audit/RetroBuildings("+buildingID+")/Audit.GetBuildingBasicInfo");
        FinancialIDTemp = response.path("FinancialAssumptions.Id");
        ApplcationID = FinancialIDTemp.get(0);
        System.out.println(ApplcationID);
    }

    @Test
    public void deleteLaborPullDataBuilding()
    {
        getBuidlingForLabor();
        deleteBuildingLaborPull();
    }

    @Test
    public void test()
    {
        RestAssured.given().header("Authorization","Basic U2F0ZWVzaC5oQGVjb2luc2lnaHQuY29tOkB1dDBtQHRpMG46YmVhMmJkZjktZmZmNS00MWU5LWEzMjItMjhmOTdkOWVmYmNl").
                header("Content-Type","application/json;odata.metadata=minimal").queryParam("t",epoch).body("{\"BuildingId\":\"00000000-0000-0000-0000-000000000000\",\"SpecificationId\":\"00000000-0000-0000-0000-000000000000\"}").
                header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36").
                when().post("https://eiapidev.azurewebsites.net/v1/Audit/ReportDefinitions(f65df722-9416-40fd-b41c-007ef723de16)/Audit.GenerateProposal").then().log().all().assertThat().statusCode(200);

    }
}
*/