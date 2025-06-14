import requests

def fetch_title():
    url = "https://httpbin.org/json"
    try:
        response = requests.get(url)
        response.raise_for_status()
        data = response.json()
        slideshow = data.get("slideshow",{})
        title = slideshow.get("title")

        if title:
            print(f"The title is {title}")
        else:
            print("No title found")
    except requests.exceptions.RequestException as e:
        print(f"Error occurred while calling API: {e}")
if __name__ == "__main__":
    fetch_title()