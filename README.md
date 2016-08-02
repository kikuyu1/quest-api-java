#Questsms Bulk SMS API JAVA

Table of contents
1. Installation 
2. Sending sms
3. Checking Balance 
4. Scheduling sms
5. Marketing Lists
6. Add to marketing list

<h3>Installation</h3>

Quest sms is very easy to use and install. Download or clone  questsms package from the git hub link below.
https://github.com/kikuyu1/quest-api-java

All you need to do now is to Include Quest the questsms package in your project 

<h3>Sending a Simple SMS</h3>

To send sms you need to follow these 3 simple steps

<h4>1. Import SendSms class from questsms module</h4>

Import questapi.SendSms

<h4>2. Create an instance of class </h4>
You need to pass 5 arguments

<strong>api_key </strong>

This is your api key.its required and it should not be null

 <pre>Api-key = ‘your api key’ </pre>

<strong>Sender</strong>

This is the name that appears to the  recipients

<pre>Sender  = ‘your sender id’</pre>

</strong>Username </strong>

<pre>Username = = ‘your username’</pre>

</strong>Message </strong>
This is the message you want to send. 

<pre>Message = ‘your message’</pre>

</strong>To</strong>

This should be a recipients phone no. It can be single no or Arraylist of 	numbers.

<pre>to = ‘+254722....56’</pre>

Or

<pre>ArrayList<String> numbers = new ArrayList<>();</pre>

Example of SendSms instance is

<pre>SendSms sms = new SendSms("username", "your key", "sender id", 	numbers, 	"message");</pre>

<h4>3. The final step is to call the send sms method</h4>
If numbers is a String call the send method

<pre>sms.send()</pre>

Else if numbers is List call sendMultiple() method

<pre>sms.sendMultiple()</pre>

<h3>Checking Balance</h3>
To check your sms balance through api you need the following three simple steps

<h4>1. Import CheckBalance class from questsms module	</h4>					
Import questapi.CheckBalance

<h4>2. Create an instance of CheckBalance</h4>
You need to pass two arguments 

<strong>Api-key</strong>

<pre>api-key = “your key”</pre>

<strong>Username</strong>

<pre>username = “your username”</pre>

Example if instance include.

<pre>CheckBalance balance = new CheckBalance("username", "your key");</pre>

<h4>3. Finally is to call the check() method which return balance as string</h4>

<pre>balance.check();</pre>

<h3>SHEDULE SMS</h3>

ScheduleSMS is similar to send sms except it has one additional field 

<pre>sendondate = “shedule date”</pre>

The sendondate on date should contain date in future with the following format “YYYY-mm-dd H:M:S”

To send sms you need to follow these 3 simple steps
<h4>1. Import ScheduleSMS class from questsms package</h4>

<pre>import questapi.ScheduleSMS</pre>

<h4>2. Create an instance of class </h4>
You need to pass 5 arguments

<strong>api_key </strong>

This is your api key.its required and it should not be null

 <pre>Api-key = ‘your api key’ </pre>

<strong>Sender</strong>

This is the name that appears to the  recipients

<pre>Sender  = ‘your sender id’</pre>

<strong>Username </strong>

<pre>Username = = ‘your username’</pre>

<strong>Message </strong>
This is the message you want to send. 

<pre>Message = ‘your message’</pre>

<strong>To</strong>

This should be a recipients phone no. It can be single String or list of numbers.

<pre>to = ‘+254722....56’</pre>

Or

<pre>ArrayList<String> numbers = new ArrayList<>();</pre>

Example of SendSms instance is

<strong>Sendondate</strong>

<pre>Sendondate = “shedule date”</pre>

ScheduleSMS sms = new ScheduleSMS("username", "your key", "sender 	id", "List ", 	"message","2017-07-27 11:11:04");

<h4>3. The final step is to call the schedule() sms method</h4>

<pre>sms.schedule()</pre>

<h3>MARKETING LIST</h3>

To check your marketing list through api you need the following three simple steps

<h4>1. Import GetMarketingLists class from questsms package	</h4>					
import questapi.GetMarketingLists;

<h4>2. Create an instance of CheckBalance</h4>
You need to pass two arguments 

<strong>Api-key</strong>

<pre>api-key = “your key”</pre>

<strong>Username</strong>

<pre>username = “your username”</pre>

Example if instance include.

<pre>GetMarketingLists lists = new GetMarketingLists("username", "your key");</pre>


<h4>3. Finally is to call the get() method which return marketing lists</h4>

<pre>lists.get();</pre>

<h3>Add To Marketing</h3>

To add marketing list through api you need the following three simple steps

<h4>1. Import AddContactToMarketing class from questsms package</h4>
 
 <pre>import questapi.AddContactToMarketing;</pre>

<h4>2. Create an instance of AddToMarketing</h4>

<strong>Api-key</strong>

<pre>api-key = “your key”</pre>

<strong>Username</strong>

<pre>username = “your username”</pre>

<strong>Name</strong>

<pre>Name = “Subscriber's Name”</pre>

<strong>Phone</strong>

<pre>Phone = “Subscriber's Phone Number (including country code)”</pre>

<strong>List_id</strong>

<pre>List_id = “Desired marketing list ID”</pre>


<pre>AddContactToMarketing addContactToMarketing = new 		AddContactToMarketing("username", "your key", "List_id", "name", 			"+254729930509");</pre>


<h4>3. Finally is to call the add() method which return marketing lists</h4>
<pre>addContactToMarketing.add();</pre>

