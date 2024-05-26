# proxy_server.py

from flask import Flask, request, jsonify

app = Flask(__name__)

# Configuration option to enable or disable the usage of API keys in headers
USE_LLM_KEY_IN_HEADER = True

@app.route('/api/call', methods=['POST'])
def handle_api_call():
    data = {}
    # Check if opt-in feature is enabled
    if USE_LLM_KEY_IN_HEADER:
        # Reading API KEY From header
        if req_header_api_key := request.headers.get('X-API-KEY'):
            data["api_key"] = req_header_api_key
    else:
        # If opt-in feature is disabled, handle API key passed via SDK
        # Example: Extract API key from SDK
        if sdk_api_key := extract_sdk_api_key():
            data["api_key"] = sdk_api_key
    # Process the API call with the extracted API key
    # Your API call processing logic here
    return jsonify(data), 200

def extract_sdk_api_key():
    # Logic to extract API key from SDK
    # Example: Extract from environment variable or SDK configuration
    pass

if __name__ == '__main__':
    app.run(debug=True)
