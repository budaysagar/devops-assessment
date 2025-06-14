FROM redhat/ubi9-minimal

RUN microdnf update -y && microdnf install -y python3 python3-pip && microdnf clean all

WORKDIR /app

COPY requirements.txt .
RUN python3 -m pip install -r requirements.txt

COPY app.py .

CMD ["python3", "app.py"]
