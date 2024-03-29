package com.example.com.demo.member.adapter.out.kafka;


import com.example.com.demo.member.application.port.out.SignupMemberEventPort;
import com.example.com.demo.member.domain.Member;
import com.example.demo.common.ExternalSystemAdapter;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;

@ExternalSystemAdapter
@RequiredArgsConstructor
public class CreateEmailCertProducer implements SignupMemberEventPort {

    private final KafkaTemplate kafkaTemplate;


    @Override
    public void signupMemberEvent(Member member) {
        ProducerRecord<String, String> record =
                new ProducerRecord<>("signup", member.getEmail());
        kafkaTemplate.send(record);
    }
}