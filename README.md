========================================== Insert Statements ==========================================

// Table 1: System
INSERT INTO wiki.system("systemId", "systemName") VALUES (1, 'Ratings');
INSERT INTO wiki.system("systemId", "systemName") VALUES (2, 'Analytical');
INSERT INTO wiki.system("systemId", "systemName") VALUES (3, 'Billing');
INSERT INTO wiki.system("systemId", "systemName") VALUES (4, 'Dissemination');
INSERT INTO wiki.system("systemId", "systemName") VALUES (5, 'Research');

// Table 2: Application
INSERT INTO wiki.application("applicationId", "applicationName", "systemId") VALUES (1, 'applicationName_011', 1);
INSERT INTO wiki.application("applicationId", "applicationName", "systemId") VALUES (2, 'applicationName_021', 2);
INSERT INTO wiki.application("applicationId", "applicationName", "systemId") VALUES (3, 'applicationName_031', 3);
INSERT INTO wiki.application("applicationId", "applicationName", "systemId") VALUES (4, 'applicationName_041', 4);
INSERT INTO wiki.application("applicationId", "applicationName", "systemId") VALUES (5, 'CMS', 5);
INSERT INTO wiki.application("applicationId", "applicationName", "systemId") VALUES (6, 'DMS', 5);
INSERT INTO wiki.application("applicationId", "applicationName", "systemId") VALUES (7, 'EMS', 5);

// Table 3: About
INSERT INTO wiki.about("aboutId", about, "applicationId", "systemId") VALUES (1, 'About-01', null, 1);
INSERT INTO wiki.about("aboutId", about, "applicationId", "systemId") VALUES (2, 'About-02', null, 2);
INSERT INTO wiki.about("aboutId", about, "applicationId", "systemId") VALUES (3, 'About-03', null, 3);
INSERT INTO wiki.about("aboutId", about, "applicationId", "systemId") VALUES (4, 'About-40', 4, null);
INSERT INTO wiki.about("aboutId", about, "applicationId", "systemId") VALUES (5, 'About-50', 5, null);
INSERT INTO wiki.about("aboutId", about, "applicationId", "systemId") VALUES (6, 'About-60', 5, null);
INSERT INTO wiki.about("aboutId", about, "applicationId", "systemId") VALUES (7, 'About-70', 5, null);

// Table 4: Highlights
INSERT INTO wiki.highlight("highlightId", highlight, "applicationId", "systemId") VALUES (1, 'Highlight', 1, null);
INSERT INTO wiki.highlight("highlightId", highlight, "applicationId", "systemId") VALUES (2, 'Highlight', 2, null);
INSERT INTO wiki.highlight("highlightId", highlight, "applicationId", "systemId") VALUES (3, 'Highlight', null, 3);
INSERT INTO wiki.highlight("highlightId", highlight, "applicationId", "systemId") VALUES (4, 'Highlight', null, 4);
INSERT INTO wiki.highlight("highlightId", highlight, "applicationId", "systemId") VALUES (5, 'Highlight-55', 5, null);
INSERT INTO wiki.highlight("highlightId", highlight, "applicationId", "systemId") VALUES (6, 'Highlight-65', 5, null);
INSERT INTO wiki.highlight("highlightId", highlight, "applicationId", "systemId") VALUES (7, 'Highlight-75', 5, null);

// Table 5: Upstream
INSERT INTO wiki.upstream("upstreamId", upstream01, upstream02, upstream03, upstream04, upstream05, upstream06, upstream07, upstream08, upstream09, upstream10, "applicationId") VALUES (1, 'upstream_011', null, null, null, null, null, null, null, null, null, 1);
INSERT INTO wiki.upstream("upstreamId", upstream01, upstream02, upstream03, upstream04, upstream05, upstream06, upstream07, upstream08, upstream09, upstream10, "applicationId") VALUES (2, 'upstream_021', null, null, null, null, null, null, null, null, null, 2);
INSERT INTO wiki.upstream("upstreamId", upstream01, upstream02, upstream03, upstream04, upstream05, upstream06, upstream07, upstream08, upstream09, upstream10, "applicationId") VALUES (3, 'upstream_031', null, null, null, null, null, null, null, null, null, 3);
INSERT INTO wiki.upstream("upstreamId", upstream01, upstream02, upstream03, upstream04, upstream05, upstream06, upstream07, upstream08, upstream09, upstream10, "applicationId") VALUES (4, 'upstream_041', null, null, null, null, null, null, null, null, null, 4);
INSERT INTO wiki.upstream("upstreamId", upstream01, upstream02, upstream03, upstream04, upstream05, upstream06, upstream07, upstream08, upstream09, upstream10, "applicationId") VALUES (5, 'upstream_051', null, null, null, null, null, null, null, null, null, 5);
INSERT INTO wiki.upstream("upstreamId", upstream01, upstream02, upstream03, upstream04, upstream05, upstream06, upstream07, upstream08, upstream09, upstream10, "applicationId") VALUES (6, 'upstream_052', null, null, null, null, null, null, null, null, null, 6);
INSERT INTO wiki.upstream("upstreamId", upstream01, upstream02, upstream03, upstream04, upstream05, upstream06, upstream07, upstream08, upstream09, upstream10, "applicationId") VALUES (7, 'upstream_053', null, null, null, null, null, null, null, null, null, 7);

// Table 6: Downstream
INSERT INTO wiki.downstream("downstreamId", downstream01, downstream02, downstream03, downstream04, downstream05, downstream06, downstream07, downstream08, downstream09, downstream10, "applicationId") VALUES (1, 'downstream_011', null, null, null, null, null, null, null, null, null, 1);
INSERT INTO wiki.downstream("downstreamId", downstream01, downstream02, downstream03, downstream04, downstream05, downstream06, downstream07, downstream08, downstream09, downstream10, "applicationId") VALUES (2, 'downstream_021', null, null, null, null, null, null, null, null, null, 2);
INSERT INTO wiki.downstream("downstreamId", downstream01, downstream02, downstream03, downstream04, downstream05, downstream06, downstream07, downstream08, downstream09, downstream10, "applicationId") VALUES (3, 'downstream_031', null, null, null, null, null, null, null, null, null, 3);
INSERT INTO wiki.downstream("downstreamId", downstream01, downstream02, downstream03, downstream04, downstream05, downstream06, downstream07, downstream08, downstream09, downstream10, "applicationId") VALUES (4, 'downstream_041', null, null, null, null, null, null, null, null, null, 4);
INSERT INTO wiki.downstream("downstreamId", downstream01, downstream02, downstream03, downstream04, downstream05, downstream06, downstream07, downstream08, downstream09, downstream10, "applicationId") VALUES (5, 'downstream_051', null, null, null, null, null, null, null, null, null, 5);
INSERT INTO wiki.downstream("downstreamId", downstream01, downstream02, downstream03, downstream04, downstream05, downstream06, downstream07, downstream08, downstream09, downstream10, "applicationId") VALUES (6, 'downstream_052', null, null, null, null, null, null, null, null, null, 6);
INSERT INTO wiki.downstream("downstreamId", downstream01, downstream02, downstream03, downstream04, downstream05, downstream06, downstream07, downstream08, downstream09, downstream10, "applicationId") VALUES (7, 'downstream_053', null, null, null, null, null, null, null, null, null, 7);

// Table 7: Point of Contact
INSERT INTO wiki.poc("pocId", env, poc01, poc02, poc03, "applicationId") VALUES (1, 'Bus', 'Poc_1', '', '', 1);
INSERT INTO wiki.poc("pocId", env, poc01, poc02, poc03, "applicationId") VALUES (2, 'Bus', 'Poc_1', 'Poc_2', 'Poc_3', 2);
INSERT INTO wiki.poc("pocId", env, poc01, poc02, poc03, "applicationId") VALUES (3, 'Bus', 'Poc_1', 'Poc_2', 'Poc_3', 3);
INSERT INTO wiki.poc("pocId", env, poc01, poc02, poc03, "applicationId") VALUES (4, 'Bus', 'Poc_1', 'Poc_2', 'Poc_3', 4);
INSERT INTO wiki.poc("pocId", env, poc01, poc02, poc03, "applicationId") VALUES (5, 'Bus', 'Poc_1', 'Poc_2', 'Poc_3', 5);
INSERT INTO wiki.poc("pocId", env, poc01, poc02, poc03, "applicationId") VALUES (6, 'Dev', 'Poc_1', 'Poc_2', 'Poc_3', 5);
INSERT INTO wiki.poc("pocId", env, poc01, poc02, poc03, "applicationId") VALUES (7, 'Qa', 'Poc_1', 'Poc_2', 'Poc_3', 5);

// Table 8: Related Links
INSERT INTO wiki.relatedlink("relatedlinkId", "relatedlink", "applicationId") VALUES (1, 'Relative_Link_011', 1);
INSERT INTO wiki.relatedlink("relatedlinkId", "relatedlink", "applicationId") VALUES (2, 'Relative_Link_021', 2);
INSERT INTO wiki.relatedlink("relatedlinkId", "relatedlink", "applicationId") VALUES (3, 'Relative_Link_031', 3);
INSERT INTO wiki.relatedlink("relatedlinkId", "relatedlink", "applicationId") VALUES (4, 'Relative_Link_041', 4);
INSERT INTO wiki.relatedlink("relatedlinkId", "relatedlink", "applicationId") VALUES (5, 'Relative_Link_051', 5);
INSERT INTO wiki.relatedlink("relatedlinkId", "relatedlink", "applicationId") VALUES (6, 'Relative_Link_052', 5);
INSERT INTO wiki.relatedlink("relatedlinkId", "relatedlink", "applicationId") VALUES (7, 'Relative_Link_053', 5);

// Table 9: Video
INSERT INTO wiki.video("videoId", video, "applicationId") VALUES (1, 'Video_011', 1);
INSERT INTO wiki.video("videoId", video, "applicationId") VALUES (2, 'Video_021', 2);
INSERT INTO wiki.video("videoId", video, "applicationId") VALUES (3, 'Video_031', 3);
INSERT INTO wiki.video("videoId", video, "applicationId") VALUES (4, 'Video_041', 4);
INSERT INTO wiki.video("videoId", video, "applicationId") VALUES (5, 'Video_051', 5);
INSERT INTO wiki.video("videoId", video, "applicationId") VALUES (6, 'Video_052', 5);
INSERT INTO wiki.video("videoId", video, "applicationId") VALUES (7, 'Video_053', 5);

// Table 10: App Login
INSERT INTO wiki.applogin("apploginId", "applogin", "applicationId") VALUES (1, 'AppLogin_011', 1);
INSERT INTO wiki.applogin("apploginId", "applogin", "applicationId") VALUES (2, 'AppLogin_021', 2);
INSERT INTO wiki.applogin("apploginId", "applogin", "applicationId") VALUES (3, 'AppLogin_031', 3);
INSERT INTO wiki.applogin("apploginId", "applogin", "applicationId") VALUES (4, 'AppLogin_041', 4);
INSERT INTO wiki.applogin("apploginId", "applogin", "applicationId") VALUES (5, 'AppLogin_051', 5);
INSERT INTO wiki.applogin("apploginId", "applogin", "applicationId") VALUES (6, 'AppLogin_052', 5);
INSERT INTO wiki.applogin("apploginId", "applogin", "applicationId") VALUES (7, 'AppLogin_053', 5);

========================================== Create: Sequences ==========================================

system_seq
application_seq
about_seq
highlight_seq
upstream_seq
downstream_seq
poc_seq
relatedlink_seq
video_seq
applogin_seq

========================================== Select Queries ==========================================

// Table 1: System
SELECT system.*
FROM wiki.system system
Order By system."systemId";

// Table 2: Application
SELECT application.*
FROM wiki.application application
INNER JOIN wiki.system system
ON application."systemId" = system."systemId"
And application."applicationId" = 2
Order By application."applicationId";

// Table 3: About
SELECT about.*
FROM wiki.about about
INNER JOIN wiki.system system
ON about."systemId" = system."systemId"
And system."systemId" = 2
Order By about."aboutId";

SELECT about.*
FROM wiki.about about
INNER JOIN wiki.application application
ON about."applicationId" = application."applicationId"
And application."applicationId" = 5
Order By about."aboutId";

// Table 4: Highlights
SELECT highlight.*
FROM wiki.highlight highlight
INNER JOIN wiki.system system
ON highlight."systemId" = system."systemId"
And system."systemId" = 3
Order By highlight."highlightId";

SELECT highlight.*
FROM wiki.highlight highlight
INNER JOIN wiki.application application
ON highlight."applicationId" = application."applicationId"
And application."applicationId" = 5
Order By highlight."highlightId";

// Table 5: Upstream
SELECT upstream.*
FROM wiki.upstream upstream
INNER JOIN wiki.application application
ON upstream."applicationId" = application."applicationId"
And application."applicationId" = 2;

// Table 6: Downstream
SELECT downstream.*
FROM wiki.downstream downstream
INNER JOIN wiki.application application
ON downstream."applicationId" = application."applicationId"
And application."applicationId" = 2;

// Table 7: Point of Contact
SELECT poc.*
FROM wiki.poc poc
INNER JOIN wiki.application application
ON poc."applicationId" = application."applicationId"
And application."applicationId" = 2
Order By poc."pocId";

// Table 8: Related Links
SELECT relatedlink.*
FROM wiki.relatedlink relatedlink
INNER JOIN wiki.application application
ON relatedlink."applicationId" = application."applicationId"
And application."applicationId" = 2
Order By relatedlink."relatedlinkId";

// Table 9: Video
SELECT video.*
FROM wiki.video video
INNER JOIN wiki.application application
ON video."applicationId" = application."applicationId"
And application."applicationId" = 2
Order By video."videoId";

// Table 10: App Login
SELECT applogin.*
FROM wiki.applogin applogin
INNER JOIN wiki.application application
ON applogin."applicationId" = application."applicationId"
And application."applicationId" = 2
Order By applogin."apploginId";

========================================== 01: GET :: All Systems --> Backend Calls & JSON Objects ==========================================

http://localhost:8081/wiki/systems

Output:

[
{
"systemId": 1001,
"systemName": "Ratings",
"about": {
"aboutId": 3001,
"about": "Ratings workflow system are the set of processes involved in creation of rating from creator apps and dissemination of ratings to end applications which includes\nCreating Deals and \nRating /Approving/Releasing Issuers/Debts/Deals and\nEditing/Approving/Releasing of Press Releases (stand alone or with ratings data) and\nEditing/Approving/Releasing Invoice Request Sheets",
"systemId": 1001
},
"highlights": [
{
"highlightId": 4001,
"highlight": "Ratings assigned on Moody’s global long-term and short-term rating scales are forward-looking opinions of the relative credit risks of\nfinancial obligations issued by non-financial corporates",
"systemId": 1001
},
{
"highlightId": 4002,
"highlight": " structured finance vehicles, project finance vehicles and\npublic sector entities",
"systemId": 1001
},
{
"highlightId": 4003,
"highlight": "Moody’s defines credit risk as the risk that an entity may not meet its contractual financial obligations as they come due and any estimated financial loss in the event of default or impairment, project finance vehicles and public sector entities",
"systemId": 1001
}
],
"applications": [
{
"applicationId": 2001,
"applicationName": "Accurate",
"systemId": 1001
},
{
"applicationId": 2002,
"applicationName": "nRDE",
"systemId": 1001
},
{
"applicationId": 2003,
"applicationName": "ORP",
"systemId": 1001
},
{
"applicationId": 2004,
"applicationName": "RAD(FIG Endgame)",
"systemId": 1001
}
]
},
{
"systemId": 1002,
"systemName": "Analyst",
"about": {
"aboutId": 3002,
"about": "The Analytic Unit under analytical systems are critical workload concepts – they provide MIS analytic stakeholders and management with a consistent and standardized measure for managing and monitoring analytic workload, composition and assignments., integrated risk management data and analysis to our customers.",
"systemId": 1002
},
"highlights": [
{
"highlightId": 4004,
"highlight": "Enhance the controls related to the Conflict and Attestation Management Process",
"systemId": 1002
},
{
"highlightId": 4005,
"highlight": "Help MIS’s compliance with the existing and emerging laws while alleviating the burden on analyst workload.",
"systemId": 1002
},
{
"highlightId": 4006,
"highlight": "Rotate key analysts off covered EU/UK entities and covered non-eu non-uk entities to comply with MIS’s regulatory obligations in a way that minimizes disruption to ratings quality and business operations",
"systemId": 1002
}
],
"applications": [
{
"applicationId": 2005,
"applicationName": "CAMS",
"systemId": 1002
},
{
"applicationId": 2006,
"applicationName": "Analyst Rotation",
"systemId": 1002
}
]
},
{
"systemId": 1003,
"systemName": "Billing",
"about": {
"aboutId": 3003,
"about": "Building Systems generally used for Processing billing invoices to customers, there are some other functions like Publishing Announcements and press releases and Approving rating actions and release actions",
"systemId": 1003
},
"highlights": [
{
"highlightId": 4007,
"highlight": "Initiate the pricing process",
"systemId": 1003
},
{
"highlightId": 4008,
"highlight": "Finalize the pricing sheet",
"systemId": 1003
},
{
"highlightId": 4009,
"highlight": "Invoice Processing",
"systemId": 1003
}
],
"applications": [
{
"applicationId": 2007,
"applicationName": "Phoenix",
"systemId": 1003
},
{
"applicationId": 2008,
"applicationName": "Pyramid",
"systemId": 1003
}
]
},
{
"systemId": 1004,
"systemName": "Dissemination",
"about": {
"aboutId": 3004,
"about": "Dissemenation system is basically a dissemination  API which is useful for dissemination of data flow from source systems to the target systems.",
"systemId": 1004
},
"highlights": [
{
"highlightId": 4010,
"highlight": "processes the PR.",
"systemId": 1004
},
{
"highlightId": 4011,
"highlight": "Dissemination logic to route these PRs to targets like RMC, MDC, AQM",
"systemId": 1004
},
{
"highlightId": 4012,
"highlight": "DAPI replaced the old system (AIX Servers) of processing the PRs which is EPI Publishing process.",
"systemId": 1004
}
],
"applications": [
{
"applicationId": 2009,
"applicationName": "DAPI",
"systemId": 1004
}
]
},
{
"systemId": 1005,
"systemName": "Research",
"about": {
"aboutId": 3005,
"about": "Research workflow system incorporates the extensive research study backed up by detailed analaysis to predemine  high standards for ethics and integrity and rigorous risk management whcih enables us to provide independent, integrated risk management data and analysis to our customers.",
"systemId": 1005
},
"highlights": [
{
"highlightId": 4013,
"highlight": "Provide the Next Generation Authoring system.",
"systemId": 1005
},
{
"highlightId": 4014,
"highlight": "Improve Time to Market, quality and compliance of Report output.",
"systemId": 1005
},
{
"highlightId": 4015,
"highlight": "Statistics for optimizing the use of resources and adapting the organizational structure to changing trends.",
"systemId": 1005
}
],
"applications": [
{
"applicationId": 2010,
"applicationName": "CMS",
"systemId": 1005
},
{
"applicationId": 2011,
"applicationName": "FMP",
"systemId": 1005
}
]
},
{
"systemId": 1006,
"systemName": "Scorecard",
"about": {
"aboutId": 3006,
"about": " Scorecard systems are one, through which the credit scores(ratings) are calculated and showing in the Reports or Scorecard and then proceed further for publish the ratings on MDC (www.moodys.com/). MFM Excel Application is used by Analyst or FDA team to be spreading data or calculating scores of data points of each account for specific Organizations/Issuers/Entities..",
"systemId": 1006
},
"highlights": [
{
"highlightId": 4016,
"highlight": "Chart Of Accounts (COA) data retrieval and saving",
"systemId": 1006
},
{
"highlightId": 4017,
"highlight": "Generating & emailing exception report for the ADM",
"systemId": 1006
},
{
"highlightId": 4018,
"highlight": "Preparing & sharing data with PFG Surveillance team",
"systemId": 1006
}
],
"applications": [
{
"applicationId": 2012,
"applicationName": "AHS",
"systemId": 1006
}
]
},
{
"systemId": 1007,
"systemName": "Commercial",
"about": {
"aboutId": 3007,
"about": "To maintain and develop MIS business and revenue by pursuing strategic growth opportunities, creating new products, building relationships, communicating the value that differentiates MIS and delivering a consistently superior customer experience.",
"systemId": 1007
},
"highlights": [
{
"highlightId": 4019,
"highlight": "Commercial application is used to handle the sales processes (managing billing/shipping process, sales order process) within Moodys.",
"systemId": 1007
},
{
"highlightId": 4020,
"highlight": "MIS (Moody’s Investor Service) is one of the applications of the commercial which deals with the opportunities and products management. ",
"systemId": 1007
}
],
"applications": [
{
"applicationId": 2013,
"applicationName": "Saleforce(front-end)",
"systemId": 1007
}
]
}
]

========================================== 02: GET :: Application by applicationId --> Backend Calls & JSON Objects ==========================================

http://localhost:8081/wiki/application/5

Output:

{
"applicationId": 2002,
"applicationName": "nRDE",
"systemId": 1001,
"about": {
"aboutId": 3009,
"about": "New Ratings Data Entry is a conjoined twin of Accurate (Core). It’s the front-end UI application which stores the ratings released from Accurate and provides two communication to inject the ratings data into Accurate in Analyst Queue and also for data maintenance. Primary user: GMO(Global Middle Office)",
"applicationId": 2002
},
"highlights": [
{
"highlightId": 4022,
"highlight": "Creates/updates Issuers, Debts, Programs, Equities",
"applicationId": 2002
},
{
"highlightId": 4023,
"highlight": "Lookup maintenance",
"applicationId": 2002
},
{
"highlightId": 4024,
"highlight": "Updates Analyst profile info",
"applicationId": 2002
},
{
"highlightId": 4025,
"highlight": "Rating changes/corrections",
"applicationId": 2002
},
{
"highlightId": 4026,
"highlight": "Operates on Core Ratings Databases (Sybase)",
"applicationId": 2002
}
],
"upstream": {
"upstreamId": 5002,
"upstream01": "Accurate",
"applicationId": 2002
},
"downstream": {
"downstreamId": 6002,
"downstream01": "Addendum",
"downstream02": "EDMS",
"downstream03": "MDM",
"downstream04": "SFF",
"downstream05": "CMS",
"downstream06": "DAPI",
"downstream07": "PIT/SFGNRT/SRDS",
"downstream08": "spotlight",
"downstream09": "RMC",
"downstream10": "MDC",
"applicationId": 2002
},
"pocs": [
{
"pocId": 7002,
"env": "Bus",
"poc01": "Soundari Chandran",
"applicationId": 2002
},
{
"pocId": 7003,
"env": "Dev",
"poc01": "Sudhir Gorantla",
"poc02": "Saurav Kulbhushan",
"applicationId": 2002
},
{
"pocId": 7004,
"env": "Qa",
"poc01": "Madhu Raghuwanshi",
"applicationId": 2002
}
],
"relatedlinks": [
{
"relatedlinkId": 8002,
"relatedlink": "https://mdpconfluence.ad.moodys.net:8443/pages/viewpage.action?pageId=26051477",
"applicationId": 2002
}
],
"videos": [
{
"videoId": 9002,
"video": "86,105,100,101,111,95,48,50,49",
"applicationId": 2002
}
],
"applogins": [
{
"apploginId": 10002,
"applogin": "https://ftc-wbrdeweb303.ad.moodys.net/Moodys.nRDE.UI/Login.aspx open in internet explorer only(with windows credential)",
"applicationId": 2002
}
]
}

========================================== 03: GET :: Application by applicationName --> Backend Calls & JSON Objects ==========================================

http://localhost:8081/wiki/application?appName=ORP

Output:

{
"applicationId": 2003,
"applicationName": "ORP",
"systemId": 1001
}

========================================== 04: POST :: New System --> Backend Calls & JSON Objects ==========================================

http://localhost:8081/wiki/newsys

Input:

{
"systemName": "Testing-01",
"about": {
"about": "Testing-About-01"
},
"highlights": [
{
"highlight": "Testing-Highlight-01"
},
{
"highlight": "Testing-Highlight-02"
}
]
}

Output:

{
"systemId": 20,
"systemName": "Testing-01"
}

========================================== 05: POST :: New Application --> Backend Calls & JSON Objects ==========================================

http://localhost:8081/wiki/system/8/newapp

Input:

{
"applicationName": "Testing-01",
"about": {
"about": "Testing-About-01"
},
"highlights": [
{
"highlight": "Testing-Highlight-01"
},
{
"highlight": "Testing-Highlight-02"
}
],
"upstream": {
"upstream01": "upstream_051",
"upstream02": "upstream_052"
},
"downstream": {
"downstream01": "downstream_051",
"downstream02": "downstream_052"
},
"pocs": [
{
"env": "Bus",
"poc01": "Poc_1",
"poc02": "Poc_2",
"poc03": "Poc_3"
},
{
"env": "Dev",
"poc01": "Poc_1",
"poc02": "Poc_2",
"poc03": "Poc_3"
},
{
"env": "Qa",
"poc01": "Poc_1",
"poc02": "Poc_2",
"poc03": "Poc_3"
}
],
"relatedlinks": [
{
"relatedlink": "Relative_Link_051"
},
{
"relatedlink": "Relative_Link_052"
},
{
"relatedlink": "Relative_Link_053"
}
],
"applogins": [
{
"applogin": "AppLogin_051"
},
{
"applogin": "AppLogin_052"
},
{
"applogin": "AppLogin_053"
}
]
}

Output:

{
"applicationId": 11,
"applicationName": "Testing-01",
"systemId": 8
}

==========================================  ==========================================
