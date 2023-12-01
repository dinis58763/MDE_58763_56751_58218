import requests
import json

# Replace these values with your actual Slack token and channel ID
slack_token = 'xoxb-6264888934199-6276668934437-sp8Y21jz7Eo23iOcSWwpd2cw'
channel_id = 'C06879FFTK5'

# API endpoint for posting messages
api_url = 'https://slack.com/api/chat.postMessage'

# List of messages to send
messages = []  # Create an empty list to store task names
    
messages.append("TASK: name: Literature Review, description: This is the description of the literature review, deadline: 2023-11-01, status: DONE")
messages.append("TASK: name: Research, description: This is the description of the research, deadline: 2023-11-21, status: NOT_STARTED")
messages.append("TASK: name: Data Collection, description: , deadline: 2023-11-21, status: NOT_STARTED")
messages.append("MILESTONE: name: Literature Review, description: Completed, completionDate: ")
messages.append("MILESTONE: name: milest1, description: , completionDate: ")

# Set the authorization header with your Slack token
headers = {
    'Content-Type': 'application/json',
    'Authorization': f'Bearer {slack_token}',
}

# Iterate over the messages and make the API request to post each message
for message_text in messages:
    # Message data
    message_data = {
        'channel': channel_id,
        'text': message_text,
    }

    # Make the API request to post the message
    response = requests.post(api_url, headers=headers, data=json.dumps(message_data))
    print(response.content)

    # Check the response status for each message
    if response.status_code == 200:
        print(f'Message posted successfully: {message_text}')
    else:
        print(f'Error posting message. Status code: {response.status_code}, Response: {response.text}')

