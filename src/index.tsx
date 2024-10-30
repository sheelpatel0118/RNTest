import { useEffect, type PropsWithChildren } from 'react';
import {
  NativeModules,
  Platform,
  requireNativeComponent,
  type ViewProps,
} from 'react-native';

const { DoorstepAIModule } = NativeModules;
const DoorstepAIRootNative =
  requireNativeComponent<ViewProps>('DoorstepAIRoot');

export class DoorstepAI {
  static start() {
    DoorstepAIModule.start();
  }
  static stop() {
    DoorstepAIModule.stop();
  }
}

export function DoorstepAIRoot(props: PropsWithChildren<{ token: string }>) {
  const { token } = props;
  useEffect(() => {
    if (Platform.OS === 'android') DoorstepAIModule.setToken(token);
  }, [token]);
  return Platform.OS === 'ios' ? <DoorstepAIRootNative /> : null;
}
